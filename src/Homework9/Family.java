package Homework9;
import java.util.Arrays;
import java.util.Objects;
public class Family {
        private Human mother;
        private Human father;
        private Human[] children;
        private Pet pet;

        public Family(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
            this.children = new Human[0];
            mother.setFamily(this);
            father.setFamily(this);
        }

        public void addChild(Human child) {
            child.setFamily(this);
            children = Arrays.copyOf(children, children.length + 1);
            children[children.length - 1] = child;
        }

        public boolean deleteChild(int index) {
            if (index >= 0 && index < children.length) {
                Human removedChild = children[index];
                removedChild.setFamily(null);
                System.arraycopy(children, index + 1, children, index, children.length - index - 1);
                children = Arrays.copyOf(children, children.length - 1);
                return true;
            }
            return false;
        }

        public int countFamily() {
            return 2 + children.length;
        }

        public Human getMother() {
            return mother;
        }

        public Human getFather() {
            return father;
        }

        public Human[] getChildren() {
            return children;
        }

        public Pet getPet() {
            return pet;
        }

        public void setPet(Pet pet) {
            this.pet = pet;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Family family = (Family) o;
            return Objects.equals(mother, family.mother) &&
                    Objects.equals(father, family.father) &&
                    Arrays.equals(children, family.children) &&
                    Objects.equals(pet, family.pet);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(mother, father, pet);
            result = 31 * result + Arrays.hashCode(children);
            return result;
        }

        @Override
        public String toString() {
            return "Family{mother=" + (mother != null ? mother.getName() : null) +
                    ", father=" + (father != null ? father.getName() : null) +
                    ", children=" + Arrays.toString(children) +
                    ", pet=" + pet + "}";
        }
    }
}
