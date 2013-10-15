import java.util.Stack;

/**
 * User: sunan
 * Date: 13-10-15
 * Time: 下午6:33
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Stack<String> stack = new Stack<String>();
        if (path.length() == 0 || path == null)
            return "/";
        String[] chs = path.split("/");
        for (String c : chs) {
            if (c.length() == 0 || c.equals("."))
                continue;
            else if (c.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else
                stack.push(c);
        }
        String ret = "";
        for (String t : stack) {
            ret += ("/" + t);
        }
        if (ret.length() == 0)
            return "/";
        return ret;
    }


    public static void main(String[] args) {
        SimplifyPath t = new SimplifyPath();
        String test_data = "/..";
        System.out.println(t.simplifyPath(test_data));


    }
}
