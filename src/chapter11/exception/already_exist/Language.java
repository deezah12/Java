package chapter11.exception.already_exist;

import list.ArrayList;

public class Language {
    public  static  void checkExistence(ArrayList<String> languages, String language)throws  AlreadyExistException{
        if (languages.contains(language)){
            System.out.println(language + "Already exist in languages");
        }
        else {
           languages.add(language);
            for (int i = 0; i < languages.size(); i++) {
                System.out.println(languages.get(i));
            }
        }
    }
}
