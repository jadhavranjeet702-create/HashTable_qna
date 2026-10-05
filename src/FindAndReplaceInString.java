public class FindAndReplaceInString {

    public static String findReplaceString(
            String s,
            int[] indices,
            String[] sources,
            String[] targets) {

        String result = "";
        int i = 0;

        while (i < s.length()) {

            boolean replaced = false;

            for (int j = 0; j < indices.length; j++) {

                if (i == indices[j]) {

                    String source = sources[j];

                    if (s.startsWith(source, i)) {

                        result = result + targets[j];
                        i = i + source.length();
                        replaced = true;
                    }

                    break;
                }
            }

            if (!replaced) {
                result = result + s.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "abcd";

        int indices[] = {0, 2};

        String sources[] = {"a", "cd"};

        String targets[] = {"eee", "ffff"};

        String result = findReplaceString(
                s, indices, sources, targets);

        System.out.println("Result: " + result);
    }
}