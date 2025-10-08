import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> { // generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node>[] buckets; // array of linkedlists

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // initial bucket size
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
            this.n = 0;
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % N;
        }

        private int searchInBucket(K key, int bi) {
            LinkedList<Node> bucket = buckets[bi];
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).key.equals(key)) {
                    return i; // found, return index
                }
            }
            return -1; // not found
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = 2 * N; // double bucket size
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        // ----------------- put -----------------
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di == -1) {
                // key not found → insert new node
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                // key found → update value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N; // load factor
            if (lambda > 2.0) {
                rehash();
            }
        }

        // ----------------- get -----------------
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di == -1) {
                return null; // key not found
            } else {
                return buckets[bi].get(di).value; // return value
            }
        }

        // ----------------- containsKey -----------------
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            return di != -1;
        }

        // ----------------- remove -----------------
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di == -1) {
                return null; // key not found
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        // ----------------- print (for testing) -----------------
        public void print() {
            for (int i = 0; i < buckets.length; i++) {
                System.out.print("Bucket " + i + ": ");
                for (Node node : buckets[i]) {
                    System.out.print(node.key + "=" + node.value + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China", 200);
        map.put("US", 100);
        map.put("Nepal", 50);

        map.print();

        System.out.println("Get India: " + map.get("India"));
        System.out.println("Contains US? " + map.containsKey("US"));
        System.out.println("Remove China: " + map.remove("China"));
        System.out.println("Contains China? " + map.containsKey("China"));

        map.print();
    }
}
