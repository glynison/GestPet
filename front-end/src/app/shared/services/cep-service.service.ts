import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CepServiceService {

  constructor(private httpclient: HttpClient) { }

  buscar(cep:string) {
    return this.httpclient.get('http://viacep.com.br/ws$(cep)/json')
  }
}
