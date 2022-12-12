package lab_24.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_3 {
    public interface IDocument{
        String getTypeDocument();
        String getTitleDocument();
        String getPathDocument();
    }
    public interface ICreateDocument{
        abstract IDocument CreateNew(String type, String title, String path);
        abstract IDocument CreateOpen(String type, String title, String path);
    }

    public static class Document{
        private String type;
        private String title;
        private String path;

        public Document(String type, String title, String path){
            this.type = type;
            this.title = title;
            this.path = path;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }
    public static class TextDocument extends Document implements IDocument {


        public TextDocument(String typeDocument, String titleDocument, String path) {
            super(typeDocument, titleDocument, path);
        }

        @Override
        public String getTypeDocument() {
            return this.getType();
        }

        @Override
        public String getTitleDocument() {
            return this.getTitle();
        }

        @Override
        public String getPathDocument() {
            return this.getPath();
        }

    }

    public static class ImageDocument extends Document implements IDocument {


        public ImageDocument(String typeDocument, String titleDocument, String path) {
            super(typeDocument, titleDocument, path);
        }

        @Override
        public String getTypeDocument() {
            return this.getType();
        }

        @Override
        public String getTitleDocument() {
            return this.getTitle();
        }

        @Override
        public String getPathDocument() {
            return this.getPath();
        }
    }
    public static class MusicDocument extends Document  implements IDocument {


        public MusicDocument(String typeDocument, String titleDocument, String path) {
            super(typeDocument, titleDocument, path);
        }

        @Override
        public String getTypeDocument() {
            return this.getType();
        }

        @Override
        public String getTitleDocument() {
            return this.getTitle();
        }

        @Override
        public String getPathDocument() {
            return this.getPath();
        }

    }

    public static class FactoryDocument implements ICreateDocument{

        @Override
        public IDocument CreateNew(String type, String title, String path) {
            if(type.equalsIgnoreCase("Text"))
                return new TextDocument(type,title,path);
            else if(type.equalsIgnoreCase("Image"))
                return new ImageDocument(type,title,path);
            else
                return new MusicDocument(type,title,path);
        }

        @Override
        public IDocument CreateOpen(String type, String title, String path) {
            if(type.equalsIgnoreCase("Text"))
                return new TextDocument(type,title,path);
            else if(type.equalsIgnoreCase("Image"))
                return new ImageDocument(type,title,path);
            else
                return new MusicDocument(type,title,path);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<IDocument> list = new ArrayList<>();
        int menu;
        do {
            System.out.println("File");
            System.out.println("1. New");
            System.out.println("2. Open");
            menu = in.nextInt();
            in.nextLine();
            switch (menu){
                default:
                    break;
                case 1:
                {
                    System.out.print("Enter the document type: ");
                    String type = in.nextLine();
                    System.out.print("Enter the document title: ");
                    String title = in.nextLine();
                    System.out.print("Enter the document path: ");
                    String path = in.nextLine();
                    list.add( new FactoryDocument().CreateNew(type,title,path));
                    break;
                }
                case 2:
                {
                    if(list.size() > 0)
                    {
                        System.out.println("Enter the path of the document to open: ");
                        String path = in.nextLine();
                        for ( var i : list)
                            if(i.getPathDocument().equalsIgnoreCase(path)){
                                System.out.println(i.getTypeDocument()+"Document: "+", title: "+i.getTitleDocument()+", path: "+i.getPathDocument());
                                break;
                            }
                    }
                    else {
                        System.out.println("File Empty!");
                    }
                    break;
                }
            }
        }while (menu!=0);
    }
}
