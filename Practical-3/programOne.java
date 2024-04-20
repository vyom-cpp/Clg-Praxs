public class programOne {
    public static void main(String[] args) {
    int numArgs = args.length;
    if (numArgs == 0) {
    System.out.println("No student names provided.");
    return;
    }
    System.out.println("Number of arguments = " + numArgs);
    String[] numericStrings = {
    "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth",
    "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth", "Seventeenth",
    "Eighteenth", "Nineteenth", "Twentieth"
    };
    for (int i = 0; i < numArgs; i++) {
    String studentName = args[i];
    String ordinal;
    if (i < 20) {
    ordinal = numericStrings[i];
    } else {
    ordinal = (i + 1) + "th";
    }
    System.out.println(ordinal + " Student Name is =" + studentName);
    }}}