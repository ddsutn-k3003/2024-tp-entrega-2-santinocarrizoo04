package ar.edu.utn.dds.k3003.clients;

import ar.edu.utn.dds.k3003.facades.dtos.TrasladoDTO;
import ar.edu.utn.dds.k3003.facades.dtos.ViandaDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ViandasRetrofitClient {
    @GET("viandas/{qr}")
    Call<ViandaDTO> get(@Path("qr") String qr);
    @GET("viandas/search/findByColaboradorIdAndAnioAndMes")
    Call<List<ViandaDTO>> viandasDeColaborador();
}
