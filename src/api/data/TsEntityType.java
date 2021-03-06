package api.data;

/**
 * Entity-types enumerated
 * @author kornholio
 */
public enum TsEntityType {
	IGNORE,				//For instant-queries, their returns are ignored.
	TSRETURN,
	TSCLIENT,
	TSCHANNEL,
	TSCOMPLAIN,
	TSCLIENTLIST,
	TSCHANNELLIST,
	TSCOMPLAINLIST,
	
	TSEVENTTEXTMESSAGE, 
	TSEVENTCLIENTJOINED,		
	TSEVENTCLIENTLEFT, 
	TSXEVENTCOMPLAINCOMMITTED,
	TSXEVENTCOMPLAINEXPIRED,
	TSXEVENTBRAINBEAT,
	
	TSSIMPLERESULT;
}