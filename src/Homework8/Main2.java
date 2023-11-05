package Homework8;

public class Main2 {
    public static void main(String[] args) {
        Tree myTree1 = new Tree("Елка",215);
        Tree myTree2 = new Tree(130, 56,"Gray");
        Tree myTree3 = new Tree();
        Tree myTree4 = new Tree("Дуб");
        System.out.println("Type:" + myTree1.type + "/n Height" + myTree1.height + "/n Cout of sticks" + myTree1.coutOfsticks + "/n Color" + myTree1.colour);
        System.out.println("Type:" + myTree2.type + "/n Height" + myTree2.height + "/n Cout of sticks" + myTree2.coutOfsticks + "/n Color" + myTree2.colour);
        System.out.println("/n Height" + myTree3.height + "/n Cout of sticks" + myTree3.coutOfsticks + "/n Color" + myTree3.colour);
        System.out.println("Type:" + myTree4.type + "/n Height" + myTree4.height + "/n Cout of sticks" + myTree4.coutOfsticks + "/n Color" + myTree4.colour);
    }
}
