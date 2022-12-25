import java.util.*;
public class listWrapper {
    private String name;
    private ArrayList<listWrapper> list;
    {
        list = new ArrayList<>();
    }
    public void addNew(String newName){
        if(newName.contains(".")){
            int ind=newName.indexOf(".");
            String strNewName=newName.substring(0,ind);
            listWrapper next=new listWrapper();
            String nextStr=newName.substring(ind+1);
            if(list==null){
                list = new ArrayList<>();
            }
            if(name==null){
                name=strNewName;
            }else{
                String nextName;
                if(nextStr.contains(".")){
                    nextName=nextStr.substring(0,nextStr.indexOf("."));
                }else{
                    nextName=nextStr;
                }
                for(listWrapper iter:list){
                    String wrap=iter.getName();
                    if(wrap==nextName){
                        iter.addNew(nextStr);
                        return;
                    }
                }
            }
            next.addNew(newName.substring(ind+1));
            list.add(next);

        }else {
            name=newName;
        }
    }
    public String getName() {
        return name;
    }
    public void showList() {
        System.out.print(name);
        System.out.print("[");
        for (var iter : list) {
            iter.showList();
        }
        System.out.print("]");

    }
}
