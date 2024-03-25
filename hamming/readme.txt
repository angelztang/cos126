Programming Assignment 9:  Hamming Codes


/******************************************************************************
 *  Approximate number of hours to complete this assignment
 ******************************************************************************/

Number of hours: 4



/******************************************************************************
 *  Which simulator did you use to develop your TOY programs?
 *  TOY.java or Visual X-TOY 7.1 (the toy.jar)?
 ******************************************************************************/

Visual X-TOY 7.1

/******************************************************************************
 *  Describe what, if anything, you use each of the registers for
 *  in encode.toy.
 ******************************************************************************/
R[1]: store m1
R[2]: m2
R[3]: m3
R[4]: m4
R[5]: p1
R[6]: p2
R[7]: p3
R[8]:
R[9]:
R[A]:
R[B]:
R[C]:
R[D]:
R[E]:
R[F]:


/******************************************************************************
 *  Describe what, if anything, you use each of the registers for
 *  in decode.toy.
 ******************************************************************************/
R[1]: m1
R[2]: m2
R[3]: m3
R[4]: m4
R[5]: p1, then c1
R[6]: p2, then c2
R[7]: p3, then c3
R[8]: c1 + c2, then c1 + c2 - 2
R[9]: c2 + c3, then c2 + c3 - 2
R[A]: c1 + c3, then c1 + c3 - 2
R[B]: c1 + c2 + c3, then c1 + c2 + c3 - 3
R[C]: constant 1
R[D]: constant 2
R[E]: constant 3
R[F]:


/******************************************************************************
 *  Did you encounter any serious problems? If so, please describe.
 ******************************************************************************/

Yes or no?

/******************************************************************************
 *  Write any other comments here.
 ******************************************************************************/


