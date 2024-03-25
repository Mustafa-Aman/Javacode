import java.util.ArrayList;

public class PlayList {
    public static void main(String[] args){
        ArrayList<String> desertIsladPlaylist= new ArrayList<String>();
        desertIsladPlaylist.add("song1");
        desertIsladPlaylist.add("song2");
        desertIsladPlaylist.add("song3");
        desertIsladPlaylist.add("song4");
        desertIsladPlaylist.add("song5");
        desertIsladPlaylist.add("song6");
        desertIsladPlaylist.add("song7");

        System.out.println(desertIsladPlaylist);
        System.out.println(desertIsladPlaylist.size());

        desertIsladPlaylist.remove(1);
        // desertIsladPlaylist.remove(4);
        System.out.println(desertIsladPlaylist.size());

        String temp = desertIsladPlaylist.get(3);
        desertIsladPlaylist.set(3,desertIsladPlaylist.get(4));
        desertIsladPlaylist.set(4,temp);
        System.out.println(desertIsladPlaylist.size());
        System.out.println(desertIsladPlaylist);

        // System.out.println(desertIsladPlaylist.size());
        // System.out.println(desertIsladPlaylist.indexOf("song4"));
        // desertIsladPlaylist.set(2,"song3");
        // System.out.println(desertIsladPlaylist);


    }
}
