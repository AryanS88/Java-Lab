import java.awt.*;
import java.awt.event.*;
class Menu1
{
Menu1(){
Frame f=new Frame("Menu and MenuItem");
MenuBar mb = new MenuBar();
f.setMenuBar(mb);

Menu f1=new Menu("File");
mb.add(f1);
MenuItem N =new MenuItem("New");
MenuItem Q =new MenuItem("Open");
MenuItem S =new MenuItem("Save");

f1.add(N);
f1.add(Q);
f1.add(S);

Menu ed=new Menu("Edit");
mb.add(ed);
 MenuItem cut=new MenuItem("Cut");
 MenuItem copy=new MenuItem("copy");
 MenuItem paste=new MenuItem("paste");
 
 ed.add(cut);
 ed.add(copy);
 ed.add(paste);
 
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new Menu1();
}

}




