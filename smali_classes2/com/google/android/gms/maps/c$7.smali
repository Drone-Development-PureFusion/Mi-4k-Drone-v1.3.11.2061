.class Lcom/google/android/gms/maps/c$7;
.super Lcom/google/android/gms/maps/a/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$w;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$w;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$7;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$7;->a:Lcom/google/android/gms/maps/c$w;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/n$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$7;->a:Lcom/google/android/gms/maps/c$w;

    new-instance v1, Lcom/google/android/gms/maps/model/i;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/i;-><init>(Lcom/google/android/gms/maps/model/a/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$w;->a(Lcom/google/android/gms/maps/model/i;)V

    return-void
.end method
