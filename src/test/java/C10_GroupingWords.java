import java.util.*;
public class C10_GroupingWords {
    /*

Write a programme that sorts words from a given word list into groups containing the same letters.
The order of the letters is not important, i.e. ‘cat’ and ‘dike’ must be in the same group.

example entry:
List<String> kelimeler = Arrays.asList("kedi", "dike", "masa", "aslan", "sanal", "kasa", "aksa");

expected output:
{
    "deik" = [ "kedi", "dike" ],
    "aams" = [ "masa" ],
    "aalns" = [ "aslan", "sanal" ],
    "aaks" = [ "kasa", "aksa" ]
}

     */


        public static void main(String[] args) {
            List<String> kelimeler = Arrays.asList("kedi", "dike", "masa", "aslan", "sanal", "kasa", "aksa");

            // Map to store the results
            Map<String, List<String>> gruplar = new HashMap<>();

            for (String kelime : kelimeler) {
                // Sort letters (to group words with the same letters in the same group)
                char[] harfDizisi = kelime.toCharArray();
                Arrays.sort(harfDizisi);
                String anahtar = new String(harfDizisi);

                // If this key exists, add it to the list, if not, create a new list
                gruplar.computeIfAbsent(anahtar, k -> new ArrayList<>()).add(kelime);
            }

            //Print the result
            System.out.println(gruplar);
        }


}
