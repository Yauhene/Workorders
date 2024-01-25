package Data;

public class woLinkList {
    private woLink first;
    private woLink last;
    static int elCount = 0;

    public woLinkList(){
        first = null;
        last = null;
    }

    public void insertFirst(int id, WOrder wo) {
        // Создание нового элемента
        woLink newLink = new woLink(id, wo);
        woLinkList.elCount += 1;
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
        System.out.println("Current woLinkList.elCount = " + woLinkList.elCount);
    }

    public void insertLast(int id, WOrder wo) {
        // Создание нового элемента
        woLink newLink = new woLink(id, wo);
        woLinkList.elCount += 1;
        if (first == null)
        {
            first = newLink;
        }
        if (last == null)
        {
            last = newLink;
        }
        newLink.setPrev(last); // newLink --> старое значение last
        last.next = newLink;
        last = newLink; // last --> newLink
    }

    public void woDisplayList()
    {
        System.out.println("List (first-->last): ");
        System.out.println();
        woLink current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayWoLink(); // Вывод данных
            // System.out.println("current element: " + current + "; prev: " + current.getPrev() + "; next: " + current.next);
            System.out.println();
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
    public int getElementsCount()
    {
        return woLinkList.elCount;
    }
}
