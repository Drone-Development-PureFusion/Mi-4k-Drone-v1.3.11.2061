.class Lcom/google/android/gms/maps/c$1;
.super Lcom/google/android/gms/maps/a/ag$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$j;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$1;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$1;->a:Lcom/google/android/gms/maps/c$j;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/ag$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$1;->a:Lcom/google/android/gms/maps/c$j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/c$j;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/a/e;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$1;->a:Lcom/google/android/gms/maps/c$j;

    new-instance v1, Lcom/google/android/gms/maps/model/e;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/e;-><init>(Lcom/google/android/gms/maps/model/a/e;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$j;->a(Lcom/google/android/gms/maps/model/e;)V

    return-void
.end method
