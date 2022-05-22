import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CarrinhoComponent } from './carrinho/carrinho.component';
import { HomeComponent } from './home/home.component';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { RecuperarSenhaComponent } from './recuperar-senha/recuperar-senha.component';
import { FechamentoEnderecoComponent } from './fechamento-endereco/fechamento-endereco.component';
import { FechamentoPagamentoComponent } from './fechamento-pagamento/fechamento-pagamento.component';
import { FechamentoPedidoComponent } from './fechamento-pedido/fechamento-pedido.component';
import { ClienteComponent } from './cliente/cliente.component';
import { ClienteDadosComponent } from './cliente-dados/cliente-dados.component';
import { ClienteContatosComponent } from './cliente-contatos/cliente-contatos.component';
import { ClienteEnderecoComponent } from './cliente-endereco/cliente-endereco.component';
import { ClienteSenhaComponent } from './cliente-senha/cliente-senha.component';
import { ClienteFavoritoComponent } from './cliente-favoritos/cliente-favorito.component';
import { ClientePedidosComponent } from './cliente-pedidos/cliente-pedidos.component';
import { ProdutoComponent } from './produto/produto.component';

@NgModule({
  declarations: [
    HomeComponent,
    LoginComponent,
    CarrinhoComponent,
    AppComponent,
    CadastrarComponent,
    RecuperarSenhaComponent,
    FechamentoEnderecoComponent,
    FechamentoPagamentoComponent,
    FechamentoPedidoComponent,
    ClienteComponent,
    ClienteDadosComponent,
    ClienteContatosComponent,
    ClienteEnderecoComponent,
    ClienteSenhaComponent,
    ClienteFavoritoComponent,
    ClientePedidosComponent,
    ProdutoComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]

  
})
export class AppModule { }
