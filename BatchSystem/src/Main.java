import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Schedu1e sc = new Schedu1e();

        int[] duration = {400, 100, 100, 100};
        String[] user = {"Danny Messer", "Stella Bonasera", "Stella Bonasera", "Mac Tay10r"};

//        int[] duration = {200, 200, 200};
//        String[] user = {"Gil", "Sarah", "Warrick"};

//        int[] duration = {100, 200, 50};
//        String[] user = {"Horatio Caine", "horatio caine", "YEAAAAAAH"};
//
//        int[] duration = {1000000000, 1000000000, 1000000000, 1000000000, 1, 2, 3};
//        String[] user = {"X", "X", "X", "X", "Y", "Y", "Y"};
//Arrays.
//        int[] duration = {409266933, 334294512, 374858518, 334294512, 334294512, 334294512, 897422581, 334294512, 897422581, 334294512, 410796098, 767293783, 769374442, 897422581, 199564812, 451915392, 897422581, 897422581, 769374442, 334294512, 334294512, 769374442, 334294512, 897422581, 46657114, 897422581, 119380066, 897422581, 897422581, 897422581, 769374442, 769374442, 275135858, 191207668, 2080659, 287637398, 897422581, 769374442, 334294512, 697857769, 168899841, 897422581, 334294512, 897422581, 897422581, 34711091, 334294512, 769374442, 897422581};
//        String[] user = {"wyAkOxGQVFqUOENESdgwkEloXm", "hopKfGIsTfkWSQlJnTOEKpFiGcHdkZnsrpwnZg", "srKzHSQEdMyZDrIgaURKtqkXwfv fGhfPXTWgA", "lsCicxwEHLcHAyPz", "SKDZtw mHqb", "WkCgjdesWPJawJLyWtbVxigARaqVjqyfhiuae", "vOMQfTpIDEJxyGFDqbKBkGWgWUXcwAGuLryxNFo", "kfGjOBQtkQ", "vzYewEESoRyzOWfyfCffjLONWnKk", "AKpBVFMjMNkBPVqRheQRTAKwOWDQgpOR", "Kxm", "zEtDZGewxWhqrRnCkbEzLkrrDe", "SdzpcUvvUcyKKK", "fZmaORPpaCBXk", "hdIWPeANoqqkc", "Kxm", "rCjxOq", "fFKkIyoJWhlejGbphDa", "vavQwWDMWdeuJRrymeJ", "AYqPM", "nNHai", "YPAMJTbWZtOAZaDPvUjHdszpxB", "KtNBGzNENDotaAgXrAdBPWUzsrEMbfdNQgfDp", "buzueMagGxnoTSvGzxxornbahz", "DqGbaLz", "HrcPpBjaHufENhpawkRQjMqKXQjQyPqdFOdunDNHWuCnzPznm", "srKzHSQEdMyZDrIgaURKtqkXwfv fGhfPXTWgA", "QfLTxkAQHtEqzmpWKaOryJyEGywd", "JuSxcxtgOvtbIrBPvfxdrdIyhpohleShYNxzOwkQmCJ", "hxnD", "pIbvyycYmeDEeiI", "JLUeyevSAjSExvMpSz", "srKzHSQEdMyZDrIgaURKtqkXwfv fGhfPXTWgA", "wyAkOxGQVFqUOENESdgwkEloXm", "zEtDZGewxWhqrRnCkbEzLkrrDe", "DqGbaLz", "fyiwhgMGvYTajW", "ydfRrNZVNrGBrWvrgbxfJaLzjpdnZzwdhpYhYKHCjBJfwSHPMD", "oZoabkvHdqZhppviohpfoaTXKK", "hdIWPeANoqqkc", "wyAkOxGQVFqUOENESdgwkEloXm", "LDKIyahAGMZSsOkqQeJdEPnPNfHcxxkvlAZDFcyIkEoFhBZo", "DHiQZcWvBzYfKEYCALrPhzBHdvKSxAgewzIFOdc", "ULDaYylvFdKzQpLEMKWLmkadNhysGvWohkbwZrIZlhNEbMtgUC", "MKjHu", "Kxm", "sBHTcctuoiYYorjGcRbHfjFrJWCDBClOMZiFdg", "VnGEodS viFKvu", "KkxFwrmZKC"};
//                int[] duration = {42863029, 53617987, 24970877, 77828097, 51242, 55488287, 73174032, 28915543, 15040792, 8564629, 126792019, 45755106, 5574621, 34144659, 6808793, 65263189, 12446121, 126792019, 54239800, 14708377, 14322709, 77261063, 183031197, 78906834, 60701818, 12136954, 35933873, 80535700};
//        String[] user = {"NpkqAVxmmBTG", "qStmLcbnwszsWZHlRvHQWNfgTpSMoAum", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "NpkqAVxmmBTG", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "qStmLcbnwszsWZHlRvHQWNfgTpSMoAum", "nFCmErdwLoOlMboKzYUpVk", "nFCmErdwLoOlMboKzYUpVk", "uRcQ APlZwDtUSTaX", "DCQWnZjdLlyQXztQdXV", "NpkqAVxmmBTG", "nFCmErdwLoOlMboKzYUpVk", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "uRcQ APlZwDtUSTaX", "uRcQ APlZwDtUSTaX", "lOTlDHrMelXxAWGNId", "X", "RXptLFPnszhbJluuKmTLjmmwrPQWjCD tSgGYfGaia", "NpkqAVxmmBTG", "NpkqAVxmmBTG", "nFCmErdwLoOlMboKzYUpVk", "lOTlDHrMelXxAWGNId", "uRcQ APlZwDtUSTaX", "RXptLFPnszhbJluuKmTLjmmwrPQWjCD tSgGYfGaia", "DfAxCQylYyDhVpfmaUvwTHkyNfNjkhQXcuzdAZgqsPJzrKl", "uRcQ APlZwDtUSTaX", "RXptLFPnszhbJluuKmTLjmmwrPQWjCD tSgGYfGaia"};
        //        int[] duration = {};
//        String[] user = {};
        //        int[] duration = {};
//        String[] user = {};
        //        int[] duration = {};
//        String[] user = {};
        //        int[] duration = {};
//        String[] user = {};
        //        int[] duration = {};
//        String[] user = {};
        //        int[] duration = {};
//        String[] user = {};
        //        int[] duration = {};
//        String[] user = {};

//
//        int[] result = sc.schedu1e(duration, user);
//        for(int a : result){
//            System.out.print(a+" ");
//        }
//        MergeSort ms = new MergeSort();
//        int[] arr = ms.mergeSort(new int[]{5,4,2,7,3,5,3,9,0,1});
//        int[] arr1 = {1};
//        int[] arr2 = {};
//        int[] arr3 = ms.merge(arr1,arr2);



//        for(int a : arr)
//            System.out.println(a);

//        InsertionSort is = new InsertionSort();
//        QuickSort qs = new QuickSort();
//
//        int[] arr = new int[]{5,4,2,7,3,5,3,9,0,1};
//        qs.quickSort(arr);
//        for(int a : arr) System.out.print(a+" ");
//
//        BatchSystemBySortingMap bb = new BatchSystemBySortingMap();
//        int[] result = bb.schedule( duration, user);
//        for(int a : result) System.out.print(a+" ");


//        int[] answer = {1, 3, 4, 5, 7, 9, 19, 20, 22, 24, 35, 38, 42, 46, 0, 33, 40, 2, 26, 32, 11, 34, 12, 18, 21, 30, 31, 37, 47, 6, 8, 10, 15, 45, 13, 14, 39, 16, 17, 23, 25, 27, 28, 29, 36, 41, 43, 44, 48};
//        int[] answer = {1, 6, 2, 4, 5, 13, 25, 7, 8, 12, 21, 10, 17, 0, 3, 11, 19, 20, 9, 14, 15, 23, 26, 16, 22, 18, 24, 27};
//        for(int a : result) System.out.print(a+" ");

//        for(int i=0; i < answer.length; i++)
//            if(result[i] != answer[i]){
//                System.out.println("fail");
//                return;
//            }
//        System.out.println("Success");


        int a = (int)(Math.random() * 4)+1;

        System.out.println(a);



    }
}
