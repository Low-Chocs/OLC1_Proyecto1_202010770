/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyzers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Luisi
 */
public class Reviewer {
    String name;
    public Reviewer(node tree, String name) {
        node root = new node(".", "raiz");
        node end = new node("#", "centinela");
        this.name = name;
        end.leaf = true;
        root.left = tree;
        root.right = end;
        this.tree = root;
        new_number(this.tree);
        counter = 0;
        String new_text = "digraph G {\n";
        new_text += new_tree(this.tree, this.counter);
        new_text += "}";
        System.out.println(new_text);
        System.out.println("");
        DotSvg(new_text, "ARBOLES_202010770\\");

        
        String afnd = "digraph G { \n rankdir=LR \n";
        afnd += AFND(tree);
        afnd += "}";
        System.out.println("\n Thompsom:");
        System.out.println(afnd);
        DotSvg(afnd, "AFND\\");
    }

    public String new_tree(node actual, int count) {
        String text = "";

        this.counter += 1;
        int current = this.counter;
        if (actual == null) {
            this.counter -= 1;
            return text;
        }
        if (actual.leaf) {
            text += "N" + current + "[style=filled, fillcolor=green, shape = circle, label = \""+ actual.data+"\"]\n";

        } else {
            text += "N" + current + "[style=filled, fillcolor=green, shape = circle, label = \""+ actual.data+"\"]\n";
        }
        if (count != 0) {
            text += "N" + count + " -> N" + current + ";\n";
        }
        text += new_tree(actual.left, current);
        text += new_tree(actual.right, current);
        return text;
    }
    
     public String next_one() {



     return "";
    }
    public void DotSvg(String GraphvizCode, String tmpPath) {
        try {
            try (FileWriter fw = new FileWriter(tmpPath + this.name + ".dot", true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
                out.println(GraphvizCode);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Runtime rt = Runtime.getRuntime();
            rt.exec("dot -Tsvg " + tmpPath + this.name + ".dot -o " + tmpPath + this.name + ".svg");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {}
    }
    String label = "";
      public int id = 0;
    
    public String AFND(node root) {

        label = "";
        if (root == null) {
            return label;
        }

        switch (root.type) {
            case "HOJA" : 

                if (root.data.equals("\\\'")) {
                    root.data = "\"\\\\\'\"";
                } else if (root.data.equals("\\n")) {
                    root.data = "\"\\\\n\"";
                } else if (root.data.equals("\\\"")) {
                    root.data = "\"\\\\\\\"\"";
                }
                if (root.data == "#") {
                    label += "S" + (id) + " [peripheries = 2];\n";
                } else {
                    label += "S" + id;
                    id++;
                    label += " -> S" + id + "\n";
                    String lexem = root.data;
                    label += "[label = \"" + lexem + "\" ];\n";
                    System.out.println("Estado: S" + id + " Next: "+ lexem);
                }
                break;
            case "AND":  // Listo
                label += AFND((node) root.left);
                label += AFND((node) root.right);
                break;
            case "OR":
                int auxOr = id;
                label += "S" + auxOr;
                id++;
                label += " -> S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                label += AFND((node) root.left);
                int auxleft = id;
                label += "S" + auxOr;
                id++;
                label += " -> S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                label += AFND((node) root.right);
                int auxright = id;
                id++;
                label += "S" + auxleft + " -> S" + id + "\n";
                label += "[label = \"e\"];\n";
                label += "S" + auxright + " -> S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                break;
            case "SUMA":
                int auxPlus = id + 1;
                label += "S" + id;
                id++;
                label += " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                label += AFND((node) root.left);
                label += "S" + id + " -> " + "S" + auxPlus + "\n";
                label += "[label = \"e\"];\n";
                label += "S" + id;
                System.out.println("Estado: S" + id + " Next: "+ "e");
                id++;
                label += " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                break;
            case "KLEENE":
                int idKleene = id;
                int auxKleene = id + 1;
                label += "S" + id;
                id++;
                label += " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                label += AFND((node) root.left);
                label += "S" + id + " -> " + "S" + auxKleene + "\n";
                label += "[label = \"e\"];\n";
                label += "S" + id;
                System.out.println("Estado: S" + id + " Next: "+ "e");
                id++;
                label += " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                label += "S" + idKleene + " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + idKleene + " Next: "+ "e");
                break;
            case "INTE":
                int auxInterrogation = id;
                label += "S" + id;
                id++;
                label += " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                label += AFND((node) root.left);
                label += "S" + id;
                System.out.println("Estado: S" + id + " Next: "+ "e");
                id++;
                label += " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                label += "S" + auxInterrogation + " -> " + "S" + id + "\n";
                label += "[label = \"e\"];\n";
                System.out.println("Estado: S" + id + " Next: "+ "e");
                break;
            default:
                System.out.println("Nada que presentar aqui");
        }
        return label;
    }

    

    public String show_next_table() {
        String text = "digraph G{\n";
        text += "rankdir=LR;\n" +
        "node [shape=record];\n" +
        "edge [arrowhead=vee];";
        int contering = 0;
        int counting_stars = 1;
        for (int i = 0; i < next_list.size(); i++) {
            if (counting_stars == 1) {
                text += " node"+contering+"[label=\"DATO: ";
                System.out.println("LEX: "+ next_list.get(i)+"");
                
                counting_stars++;
            } else if (counting_stars == 2) {
                text += "POS: "+ next_list.get(i)+"";
                System.out.println("POS: "+ next_list.get(i)+"");
                counting_stars++;
            } else if (counting_stars == 3) {
                text += "Next: "+ next_list.get(i)+"\"];";
                System.out.println("NEXT: "+ next_list.get(i)+"");
                text += "\n";
                contering++;
                counting_stars = 1;
            }
        }
        text +="\n}";
        System.out.println(text);
        return text;
    }

    public void new_number(node actual) {
        if (actual == null) {
            return;
        }
        if (actual.leaf) {
            actual.counter = counter;
            ArrayList<String> dat = new ArrayList<>();
            dat.add(actual.data);
            next_list.add(dat);
            ArrayList<Integer> county = new ArrayList<>();
            county.add(leaf_counter);
            next_list.add(county);
            ArrayList<Integer> number_list = new ArrayList<>();
            next_list.add(number_list);

            leaf_counter++;

            counter++;
            return;
        }
        new_number(actual.left);
        new_number(actual.right);
    }
    public ArrayList<ArrayList> next_list = new ArrayList();
    public node tree;
    public int counter = 0;
    public int leaf_counter = 0;
    public ArrayList<state> trans_list = new ArrayList();

    void check_repetation() {
        int counting_stars = 1;
        for (int i = 0; i < next_list.size(); i++) {
            if (counting_stars == 1) {
                counting_stars++;
            } else if (counting_stars == 2) {
                counting_stars++;
            } else if (counting_stars == 3) {
                int counting_stars2 = 1;
                for (int j = 0; j < next_list.size(); j++) {
                    if (counting_stars2 == 1) {
                        counting_stars++;
                    } else if (counting_stars2 == 2) {
                        counting_stars++;
                    } else if (counting_stars2 == 3) {
                        if (next_list.get(j).size() == next_list.get(i).size()) {
                            for (int k = 0; k < next_list.get(i).size(); k++) {
                                if (!next_list.get(j).contains(next_list.get(i).get(k))) {
                                    //Se encontro distinto
                                    System.out.println("HE PASADO");
                                    state new_state = new state();
                                    new_state.state = "So" + trans_list.size();
                                    new_state.lex = "" + next_list.get(i - 2);
                                    new_state.list.addAll(next_list.get(i));
                                    trans_list.add(new_state);
                                    break;
                                }
                            }
                            counting_stars2 = 1;
                        }
                    }
                    counting_stars = 1;
                }
            }
        }
        System.out.println("SE VIENE LA TRANS");
        System.out.println(trans_list.size());

    }

    void check_list() {
        for (int i = 0; i < leaf_counter; i++) {
            int pos = (i + 1) * 3 - 1;
            for (int j = 0; j < next_list.get(pos).size(); j++) {
                int pos2 = (j + 1) * 3 - 1;
                if (next_list.get(pos).size() != next_list.get(j).size()) {
                    boolean verification = true;
                    for (int k = 0; k < next_list.get(pos2).size(); k++) {
                        System.out.println(next_list.get(pos2));
                        System.out.println("fhdjkshsdafkfadjksh");
                        System.out.println(next_list.get(pos).get(k));
                        if (!next_list.get(pos).contains(next_list.get(pos2).get(k))) {
                            System.out.println("Se agrego");
                            state new_state = new state();
                            new_state.state = "So" + trans_list.size();
                            new_state.lex = "" + next_list.get(pos2 - 2);
                            new_state.list.addAll(next_list.get(pos));
                            trans_list.add(new_state);

                            continue;
                        }
                    }
                }
            }
        }
        System.out.println("Se viene la trans");
        System.out.println(trans_list);
    }

    void compare() {
        state initial_state = new state();
        initial_state.state = "S1";
        initial_state.lex = "" + next_list.get(1);
        initial_state.list = next_list.get(2);
        initial_state.show();
        trans_list.add(initial_state);

        for (int i = 0; i < trans_list.size(); i++) {
            System.out.println(trans_list.get(i));
            for (int j = 0; j < leaf_counter; j++) {
                int pos = (j + 1) * 3 - 1;

                if (next_list.get(pos).size() != trans_list.get(i).list.size()) {
                    state new_state = new state();
                    new_state.state = "So" + trans_list.size();
                    new_state.lex = "" + next_list.get(pos - 2);
                    new_state.list.addAll(next_list.get(pos));
                    trans_list.add(new_state);
                }

            }
        }

    }

    void show_state() {
        for (int i = 0; i < trans_list.size(); i++) {
            trans_list.get(i).show();
        }
    }

}

class state {

    String state;
    String lex;
    ArrayList<Integer> list = new ArrayList<>();
    boolean is_final;

    void state() {
    }

    void show() {
        System.out.println("State" + state);
        System.out.println("Lex" + lex);
        System.out.println("Lis" + list);
        System.out.println("Bool" + is_final);
    }
}
