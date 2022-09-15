/* 
 * CS211 Assignment
 * QING LIU
 * qing.liu@Bellevuecollege.edu
 * 2018.12.01 - Fall quarter
 *
 * This class is the min heap with add method.
 */
public class MinHeap {
  int[] element = new int[31];
  int size = 0;

  int parent(int index) {
      return index / 2;
  }

  boolean hasParent(int index) {// index has to be start at 2
      return index > 1;
  }

  void swap(int[] a, int index1, int index2) {
      int temp = a[index1];
      a[index1] = a[index2];
      a[index2] = temp;
  }

  public void add(int value) {
      element[++size] = value;// size increase after add new value

      int index = size;
      if (!hasParent(index)) {
          return;// if no parent ,just skip
      }

      int parentIndex = parent(index);// get the index of parent
      while (element[parentIndex]> element[index]) {
          swap(element, parentIndex, index);
          index = parentIndex;
          if (!hasParent(index)) {
              break;// if no parent ,just skip
          }
          parentIndex = parent(index);// get the index of parent
      }
  }
}
