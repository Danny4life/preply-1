package designPattern.compositeDesignPattern;

public class Main {

    public static void main(String[] args) {

        File file1 = new File("Resume.pdf");
        File file2 = new File("Budget.xlsx");


        Folder personalFolder = new Folder("Personal");
        personalFolder.add(file1);
        personalFolder.add(file2);


        File file3 = new File("projectPlan.docx");
        Folder workFolder = new Folder("Work");
        workFolder.add(file3);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(personalFolder);
        rootFolder.add(workFolder);

        rootFolder.showDetails();
    }
}
