public class Main {
    public static void main(String[] args) {
        listWrapper list=new listWrapper();
        list.addNew("test.first.new");
        list.addNew("test.first.new.end");

        list.addNew("test.second.new");
        list.addNew("test.third.new.end");
        list.showList();
    }
}
