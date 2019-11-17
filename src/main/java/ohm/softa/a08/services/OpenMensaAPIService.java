package ohm.softa.a08.services;

import ohm.softa.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class OpenMensaAPIService{
	private static final OpenMensaAPIService ourInstance = new OpenMensaAPIService();
	private final OpenMensaAPI mensaApiInstance;

	public OpenMensaAPIService getInstance()
	{
		return ourInstance;
	}

	private OpenMensaAPIService()
	{
		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("https://openmensa.org/api/v2/")
			.build();

		mensaApiInstance = retrofit.create(OpenMensaAPI.class);
	}

	public OpenMensaAPI getApi()
	{
		return mensaApiInstance;
	}
}
