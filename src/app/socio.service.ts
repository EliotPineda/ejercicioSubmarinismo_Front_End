import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Socio } from './socio';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SocioService {

  private baseURL = "http://localhost:8080/api/v1/socios";

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeSocios():Observable<Socio[]> {
    return this.httpClient.get<Socio[]>(`${this.baseURL}`);
  }
  registrarSocio(socio:Socio):Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, socio);
  }

  actualizarSocio(id:number,socio:Socio) : Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, socio);
  }

  eliminarSocio(id:number): Observable<Object> {
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
  obtenerSocioPorId(id:number):Observable<Socio>{
    return this.httpClient.get<Socio>(`${this.baseURL}/${id}`);
  }
}
