import java.util.LinkedList;

public class TopUniqueN<T extends Comparable<T>> extends LinkedList<T> {
    private int n;

    public TopUniqueN(int n) {
        super();
        this.n = n;
    }

    @Override
    public boolean add(T item) {
        if(this.size() == 0) {
            this.addFirst(item);
        } else {
            if(this.size() == n && this.getLast().compareTo(item) > 0)
                return false;

            int i = 0;
            for (T existingItem : this) {
                if (item.compareTo(existingItem) == 0) {
                    return false;
                }
                if (item.compareTo(existingItem) > 0) {
                    break;
                }
                i++;
            }

            if (i < n) {
                this.add(i, item);
            }
        }

        if(this.size() > n) {
            this.removeLast();
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(T item : this) {
            sb.append(item.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
