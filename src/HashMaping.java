public class HashMaping {

    class node
    {
        int key;
        int datd;
        node next;

        public node(int key, int data)
        {
            this.key=key;
            this.datd=data;
        }


    }

    private node[] buckets;
    int size;

    HashMaping(int size)
    {
        this.size = size;
        this.buckets = new node[size];
    }

    public int hash(int key)
    {
        return key % size;
    }

    public void  put(int key, int data)
    {
        int index=hash(key);
        node head=buckets[index];

        while (head != null)
        {
            if (head.key == key)
            {
                head.datd=data;
                return;
            }
            head=head.next;
        }

        node newnode = new node(key,data);
        newnode.next=buckets[index];
        buckets[index]=newnode;

    }

    public int get(int key)
    {

        node head;

        int index=hash(key);
        head=buckets[index];

        while (head != null )
        {
            if(head.key == key)
            {
                System.out.print(key+"-->");
                return (head.datd);


            }
            head=head.next;

        }

        return -1;


    }

    public void remove(int key)
    {

        int index=hash(key);
        node head=buckets[index];

        if(head == null)
        {

            System.out.println("key not found");
            return;
        }
        while (head != null && head.next != null )
        {
            if(head.next.key == key)
            {
                head.next=head.next.next;
                System.out.println("node delete ho gaya");
                return;

            }
            head=head.next;

        }


    }

    public static void main(String[] args) {

        HashMaping pu = new HashMaping(6);
        pu.put(21,150);
        pu.put(32,200);
        pu.put(35,300);
        pu.put(39,400);
        pu.put(41,100);
        pu.put(21,600);



        pu.remove(41);
        System.out.println();
        int result= pu.get(41);
        if(result != -1)
        {
            System.out.println(result);
        }else {
            System.out.println(" key not found");
        }
        System.out.println();






    }


}
