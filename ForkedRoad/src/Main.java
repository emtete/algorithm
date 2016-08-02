public class Main {

    public static void main(String[] args) {
        NumberOfCase noc = new NumberOfCase(5,4);
        int result = noc.dfs(0,0);

        System.out.println(result);
    }
}
