class Matrix{
	 float [][]matrix;
		Matrix(int a, float v){
			matrix	=new float[a][a];
			for (int i=0;i<a;i++)
				{
					for (int j=0;j<a;j++)
					
					{
						matrix[i][j]=v;
						
					}
					
				}
			
		}
		Matrix(int a,int b, float v){
			matrix	=new float[a][b];
			for (int i=0;i<a;i++)
				{
					for (int j=0;j<b;j++)
					
					{
						matrix[i][j]=v;
			
					}
					
				}
			
		}
		Matrix(int a,int b){
			matrix	=new float[a][b];
			for (int i=0;i<a;i++)
				{
					for (int j=0;j<b;j++)
					
					{
						matrix[i][j]=(float)(0.0);
						
					}
					
				}
			
		}
		Matrix(int a){
			matrix	=new float[a][a];
			for (int i=0;i<a;i++)
				{
					for (int j=0;j<a;j++)
					
					{
						matrix[i][j]=(float)(0.0);
						
					}
				
				}
		
    	}	
	
//add method is started 
	
		Matrix 	add(Matrix a,Matrix b)
		{
		int ar,ac,br,bc;
		ar=a.matrix.length;
		ac=a.matrix[0].length;
		br=b.matrix.length;
		bc=b.matrix[0].length;
		Matrix sum=new Matrix(ar,ac);
		if(ar==br&&ac==bc)
			{
			for(int i=0;i<ar;i++)
				{	
				for(int j=0;j<ac;j++)
					{
					sum.matrix[i][j]=a.matrix[i][j]+b.matrix[i][j];
					
					}
				}
			return sum;
			}
		else
			{
			System.out.println("Matrices cannot be added");
			return new Matrix(1,1);
			}
		
		}
//2.add method finished


//3.matmul()​ start
		
		Matrix matmul(Matrix a, Matrix b)
		{
			int ar,ac,br,bc;
			ar=a.matrix.length;
			ac=a.matrix[0].length;
			br=b.matrix.length;
			bc=b.matrix[0].length;
			
			//System.out.print(String.format("ar %d ac %d  br %d  bc %d ",ar,ac,br,bc));
			Matrix mul=new Matrix(ar,bc);
			if(ac==br)
				{
				for(int i=0;i<ar;i++)
					{	
					for(int j=0;j<bc;j++)
						{
							 for(int k=0;k<ac;k++)
								 {
								 	mul.matrix[i][j]+=a.matrix[i][k]*b.matrix[k][j];
								 }
						
						}
					}
				return mul;
				}
			else
				{
				System.out.println("Matrices cannot be multiplied");
				return new Matrix(1,1);
				}
		}
		
		//end
		
//4.scalarmul()​ :
		void scalarmul(int a)
		{
			int ar=this.matrix.length;
			int ac=this.matrix[0].length;
			for(int i=0;i<ar;i++)
			{	
			for(int j=0;j<ac;j++)
				{
				this.matrix[i][j]=a*this.matrix[i][j];
				
				}
			}
		}
		
//end
//5 getrows()​
	int getrows()
	{
		return this.matrix.length;
	}
// 6getcols()​ :
	int getcols()
	{
		return this.matrix[0].length;
	}
	
//7getelem()​ :
	float getelem(int rowno,int colno)
	{
		int ar,ac;
		ar=this.matrix.length;
		ac=this.matrix[0].length;
		if(rowno>=0&&rowno<ar&&colno>=0&&colno<ac)
		{
			return this.matrix[rowno][colno];
		}
		else {
			System.out.println("Index out of bound");
			return -100;
					
		}
		
	}
	
//8. setelem()​ :
	
	void setelem(int rowno,int colno,float value)
	{
		int ar,ac;
		ar=this.matrix.length;
		ac=this.matrix[0].length;
		if(rowno>=0&&rowno<ar&&colno>=0&&colno<ac)
		{
			this.matrix[rowno][colno]=value;
		}
		else {
			System.out.println("Index out of bound");
					
			}
	}
	
		
//9.printmatrix()​ method start
		void printmatrix(Matrix a)
		{
			int ar,ac;
			ar=a.matrix.length;
			ac=a.matrix[0].length;
			
				for(int i=0;i<ar;i++)
				{	
					for(int j=0;j<ac;j++)
						{
						System.out.print(a.matrix[i][j]+" ");
						
						}
				System.out.println();
				}
		
		}
	
}
