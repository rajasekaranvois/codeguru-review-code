package org.example;

public class ProcessData {
    public void validateData(){
        MainController mObj = new MainController();
        for(int i=0;i>0;i++)
        {
            try {
                mObj.processData();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Data "+ i);
        }
    }
}
