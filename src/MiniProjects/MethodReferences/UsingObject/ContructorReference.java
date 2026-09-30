package MiniProjects.MethodReferences.UsingObject;

import java.util.function.Function;

public class ContructorReference {
    private String name;
    public ContructorReference(String name){
        this.name = name;
    }
    public void showName(){
        System.out.println("Name : "+name);
    }

    static void main(String[] args) {
        Function<String, ContructorReference> personCreator = ContructorReference::new;
        personCreator.apply("Shubham").showName();
    }
}
