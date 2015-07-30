# RomanNumeralsKata
Classic Roman Numerals Kata in Java

To run this as a local web application on port 8080 under JDK 1.8:
```
mvn clean package tomcat7:run
```

The Romans wrote their numbers using letters; specifically the letters 'I' meaning '1', 'V' meaning '5', 'X' meaning '10', 'L' meaning '50', 'C' meaning '100', 'D' meaning '500', and 'M' meaning '1000'. There were certain rules that the numerals followed which should be observed.

The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in a row. The symbols 'V', 'L', and 'D' can never be repeated. The '1' symbols ('I', 'X', and 'C') can only be subtracted from the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM'). Only one subtraction can be made per numeral ('XC' is allowed, 'XXC' is not). The '5' symbols ('V', 'L', and 'D') can never be subtracted.

Given a positive integer number (eg 42) determine
its Roman numeral representation as a String (eg "XLII").

You cannot write numerals like IM for 999.
Wikipedia states "Modern Roman numerals are written by
expressing each digit separately starting with the
leftmost digit and skipping any digit with a value of zero."

| Value | Roman Numeral |
| -----:|  ------------:|
|1 |    "I" |
|2 |   "II" |
|3 |  "III" |
|4 |   "IV" |
|5 |    "V" |
|6 |   "VI" |
|7 |  "VII" |
|8 | "VIII" |
|9 |   "IX" |
|10 |    "X" |
|20 |   "XX" |
|30 |  "XXX" |
|40 |   "XL" |
|50 |    "L" |
|60 |   "LX" |
|70 |  "LXX" |
|80 | "LXXX" |
|90 |   "XC" |
|100 |    "C" |
|200 |   "CC" |
|300 |  "CCC" |
|400 |   "CD" |
|500 |    "D" |
|600 |   "DC" |
|700 |  "DCC" |
|800 | "DCCC" |
|900 |   "CM" |
|1000 |    "M" |
|2000 |   "MM" |
|3000 |  "MMM" |
|4000 | "MMMM" |
For example:
* 1990 -> "MCMXC"  (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")
* 2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
* 99 -> "XCIX"   (90 -> "XC" + 9 -> "IX")
* 47 -> "XLVII"  (40 -> "XL" + 7 -> "VII")
