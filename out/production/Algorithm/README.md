# 🧮  Fantastic Algorithm Implementation 
This repo helps you to find a kind of pattern when solving algorithm problems.

## Stack
What to enter into stack?  
(character, number of consecutive occurrences, index)
### store prev level information into stack and reconstruct it by popping
`Problems like:`  
* `changing "abc3[cd]xyz" to "abccdcdcdxyz"`  
* `the score of "(()(()))" is 6 based on` 
    * `() has score 1`
    * `AB has score A + B, where A and B are balanced parentheses strings.`
    * `(A) has score 2 * A, where A is a balanced parentheses string.`
  
The pattern is:  
* when traverse the input  
    + new level or deeper level (e.g.'[', '{', '(' )
        + store all prev info into stack
        + empty the current info (reset variables)
    + end of current level
        + pop prev level info
        + reconstruct the result
        + update current info
 
| LC  | Name | Link |
| :----- | :----: | :----: |
| 394 | Decode String | https://github.com/xinlonggogogo/Algorithm/blob/master/Stack/Decode_String.java |
| 856 | Score of Parentheses | https://github.com/xinlonggogogo/Algorithm/blob/master/Stack/Score_of_Parentheses.java |

  
### current operation need prev info
`Problems like:`  
* `candy crush "aabbbacd" -> "cd"`  
* `Remove All k Adjacent Duplicates` 
    * `s = "abcd", k = 2 -> "abcd"`
    * `s = "deeedbbcccbdaa", k = 3 -> "aa"`  

| LC  | Name | Link |
| :----- | :----: | :----: |
| N/A | Decode String | https://github.com/xinlonggogogo/Algorithm/blob/master/Stack/Candy_Crush_1D.java |
| 1209 | Score of Parentheses | https://github.com/xinlonggogogo/Algorithm/blob/master/Stack/Score_of_Parentheses.java |

   