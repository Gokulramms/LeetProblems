class Solution {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        boolean block = false;
        StringBuilder sb = new StringBuilder();

        for (String line : source) {
            int i = 0;
            if (!block) sb.setLength(0);
            while (i < line.length()) {
                if (!block && i + 1 < line.length() && line.startsWith("/*", i)) {
                    block = true; i += 2;
                } else if (block && i + 1 < line.length() && line.startsWith("*/", i)) {
                    block = false; i += 2;
                } else if (!block && i + 1 < line.length() && line.startsWith("//", i)) {
                    break;
                } else if (!block) sb.append(line.charAt(i++));
                else i++;
            }
            if (!block && sb.length() > 0) res.add(sb.toString());
        }
        return res;
    }
}
