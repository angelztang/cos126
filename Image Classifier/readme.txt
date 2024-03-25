Programming Assignment 6: Image Classifier


/******************************************************************************
 ***   Are you aware of the midsemester survey?  Please see Ed for          ***
 ***   instructions.                                                        ***
 ******************************************************************************/
Yes or no? Y

/******************************************************************************
 *  Approximately how many hours did it take you to complete this assignment?
 ******************************************************************************/

Number of hours: 5

/******************************************************************************
 *  Part 1. Some people (especially in Europe and Latin America) write a 7 with
 *  a line through the middle, while others (especially in Japan and Korea)
 *  make the top line crooked.
 *
 *  (a) Suppose that the training data consists solely of samples that do not
 *      use any of these conventions. How well do you think the algorithm will
 *      perform when you test it on different populations? What are the
 *      possible consequences?
 *
 *  (b) Now suppose that you are using a supervised learning algorithm to
 *      diagnose cancer. Suppose the training data consists of examples solely
 *      on individuals from population X but you use it on individuals from
 *      population Y. What are the possible consequences?
 ******************************************************************************/

ANSWER:

(a) Won't perform very well on these populations--the algorithm most likely will
predict the number 7 wrong the most if exposed to these new cases, specifically
classifiying 7s with a line through the middle as a 3 or an 8 maybe, because
these numbers have a line in the middle.


(b) The possible consequences include a lot of prediction error. Most likely,
the algorithm won't be able to diagnose the cancer accurately, if the two
populations have very differing symptoms. If the two populations are very
similar though, then the algorithm will be able to diagnose the cancer
accurately, as it was trained on a very similar population to the test cases.


/******************************************************************************
 *  Part 2
 *
 *  (a) Which digit is misclassified the most frequently?
 *
 *  (b) For this digit,  what are the top two digits that your MultiPerceptron
 *      incorrectly predicts?
 *
 *  (c) Examine some of these misclassified images. Provide an explanation
 *      of what might have caused these misclassifications.
 ******************************************************************************/

ANSWER:

(a) Most frequently misclassified digit: 9

(b) Top two digits misclassified are: 7 and 4

(c) Explanation: What most likely caused this misclassification is the fact that
9 can look very similar to 7 and 4. Specifically, if written quickly, the loop
in the 9 can be flattened, making 9's look like 7s. If the algorithm is tested
on data where the loop of the 9 is not very pronounced, then
the algorithm won't be able to distinguish between these two numbers very well.
As for the 4, the same scenario applies. When written quickly, the left hand
corner of the 4 might connect to the right hand corner of the number, creating
a false loop and making the number look like it's a 9. If the algorithm is
tested on data where the 4s look a lot like 9s, the 9 is going to be
misclassified often.

/******************************************************************************
 *  Did you encounter any serious problems? If so, please describe.
 ******************************************************************************/

Yes or no? No

/******************************************************************************
 *  Write any other comments here.
 ******************************************************************************/


