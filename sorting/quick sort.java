    public int partition(Interval[] a, int low, int high)
    {
        Interval pivot = a[high];
        
        int index = low-1;
        
        for(int i=low;i<high;i++)
        {
            if(a[i].end<=pivot.end)
            {
                index++;
                Interval temp = a[i];
                a[i] = a[index];
                a[index]=temp;
            }
        }
        
        Interval temp = a[index+1];
        a[index+1]=pivot;
        a[high] = temp;
        
        return index+1;
    }
    
    public void quicksort(Interval[] a, int low, int high)
    {
        if(low<high)
        {
        
        int pivot_index = partition(a, low, high);
            
        quicksort(a,low,pivot_index-1);
        quicksort(a,pivot_index+1,high);
        }
    }
