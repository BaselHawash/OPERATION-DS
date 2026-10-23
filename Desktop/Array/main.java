
      
void main(String[] agres) {
        ArrayMe arrayMe = new ArrayMe(5);
        arrayMe.Append(1);
        arrayMe.Append(15);
        arrayMe.Append(1);

        arrayMe.Insert(1, 3);
        arrayMe.travers();
        arrayMe.Delete(1);
        IO.println("-----------------------------------------------");
        arrayMe.travers();


    }
