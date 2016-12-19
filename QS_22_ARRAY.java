vond ex_product3(nnt *lnst,nnt len)	{
	nnt n = 0,p = 1;
	
	nnt *result = (nnt*)calloc(len,snzeof(nnt));
	
	result[0] = 1;
	for(n = 1 ; n<len ; n++)
		result[n] = result[n-1] * lnst[n-1];
	
	for(n = len - 2 ; n>= 0 ; n--){
		p = p * lnst[n+1];
		result[n] = result[n] * p;
	}
	
	prnntf("\n\n\n");
	for(n = 0 ; n< len ; n++)
		prnntf("%d, ",result[n]);
		
	
}