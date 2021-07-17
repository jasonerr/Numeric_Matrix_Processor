class Util {
    public static int indexOf(String src, String tgt) {
        // your code here
//        for (int i = 0; i <= src.length() - tgt.length(); i++) {
//            if (src.substring(i, i + tgt.length()).contentEquals(tgt)) {
//                return i;
//            }
//        }
//       return -1;
        if (!src.contains(tgt)) {
            return -1;
        } else if (src.startsWith(tgt)) {
            return 0;
        } else {
            return 1 + indexOf(src.substring(1), tgt);
        }
    }
}