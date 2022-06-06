public class EnumFun {

    public enum Suit {
        HEARTS(1), DIAMONDS(2), SPADES(3), CLUBS(4);

        Suit(int priority) {
            this.priority = priority;
        }

        private Integer priority = 0;

        public int getPriority() {
            return this.priority;
        }

        public int compare(Suit other) {
            return this.priority.compareTo(other.getPriority());
        }

    }

    enum LoadTypes {
        mortgage,
        auto,
        student,
        creditcard
    }

    public static void main(String[] args) {
        Suit suit = Suit.CLUBS;

        System.out.println(Suit.valueOf("HEARTS"));

    }

}
