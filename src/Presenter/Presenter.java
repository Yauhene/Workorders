package Presenter;

//import.Service.Model;

import Data.*;

import java.io.*;

public class Presenter {
    public static woLinkList woListForPresenter;

    public Presenter() throws IOException {
        Model ModelList = new Model();
        woListForPresenter = ModelList.getWoList();

        Viewer viewer = new Viewer();
        viewer.mainMenu();
    }
}
