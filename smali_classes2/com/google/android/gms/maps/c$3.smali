.class Lcom/google/android/gms/maps/c$3;
.super Lcom/google/android/gms/maps/a/af$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$i;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$3;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$3;->a:Lcom/google/android/gms/maps/c$i;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/af$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$3;->a:Lcom/google/android/gms/maps/c$i;

    new-instance v1, Lcom/google/android/gms/maps/model/d;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/d;-><init>(Lcom/google/android/gms/maps/model/a/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$i;->a(Lcom/google/android/gms/maps/model/d;)V

    return-void
.end method
