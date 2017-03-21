# checker_framework-gsoc-2017
It includes case study and other material related to checker framework case study
DESCRIPTION
This is a simple program where client can send two operands and a operator to server and receive the result
I have applied annotations on MathServer.java


Error before applying annotation:

   protected MathService mathService; 
   protected Socket socket;
   
since both these data members of class MathServer  were assumed to be nonnull by the compiler but no initialisation could be performed for these members till the client request comes,hence compiler gave error that being nonnull they should be initialised.

After applying annotation:
   @MonotonicNonNull 
   protected MathService mathService;
   @MonotonicNonNull 
   protected Socket socket;
   
 @MonotonicNonNull annotation ensures that datamembers  can take null values initially but should be non null before use.
 @EnsuresNonNull and @RequiresNonNull should to ensure that data members are not null at time of use although they are allowed to
 be null initially.
 
 
    @EnsuresNonNull("mathService")
    public void setMathService(MathService mathService) 
    {
        this.mathService = mathService;
    }
    @EnsuresNonNull("socket")
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    
    
    @RequiresNonNull({"socket","mathService"})
    public void execute() 
    {......}
    @RequiresNonNull("mathService")
    protected double parseExecution(String line) throws IllegalArgumentException {...}
