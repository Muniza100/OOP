public class ResistorColor {
    public int colorCode(String color) {
        String[] colors ={ "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white",};
        int result = -1;
        for (int i = 0; i < colors.length; i++) {
            if(colors[i].compareTo(color)==0){
                result = i;
                break;
            }
        }
        return result;
    }

    public String[] colors() {
        return new String[]{ "Black",
                "Brown",
                "Red",
                "Orange",
                "Yellow",
                "Green",
                "Blue",
                "Violet",
                "Grey",
                "White",};
    }
}
