## Linear Search Preview

1. The search begins at the beginning of the ArrayList and checks each Card object one at a time.

2. During each pass through the loop, the program compares the card's name with `searchName` by using `getCardName()`.

3. `break` stops the loop as soon as a matching card is found. If `break` was removed, the program would keep checking the rest of the ArrayList even after finding a match.

4. If the card is the first card in an ArrayList of 52 cards, only 1 Card object would need to be checked.

5. If the card is the last card in an ArrayList of 52 cards, the program might need to check all 52 Card objects.

6. If the card is not in the ArrayList at all, the program would have to check all 52 Card objects.

7. I think it is called a linear search because it checks the items in order, one after another, until it finds what it is looking for or reaches the end.

8. A linear search starts at the first item and checks each item one at a time. If the item is not a match, it moves to the next one and continues until it finds the item or reaches the end of the collection.

### Think Ahead

If the deck had 1,000 cards instead of 52, a disadvantage of linear search is that it could take a lot more comparisons. If the card was near the end or was not there at all, the program might have to check almost all 1,000 cards.

## Reflection

One thing I learned from this lab is how objects can be stored inside an ArrayList. Instead of just storing simple values, `ArrayList<Card>` stores Card objects that each have their own suit, name, value, and picture. I also learned why the `equals()` method was needed, because the game needs to consider two cards equal when they have the same rank even if the suits are different. I also got more practice using Git and GitHub by making commits and pushing my work as I went.