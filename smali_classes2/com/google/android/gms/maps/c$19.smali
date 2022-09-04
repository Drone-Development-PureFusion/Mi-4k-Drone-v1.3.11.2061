.class Lcom/google/android/gms/maps/c$19;
.super Lcom/google/android/gms/maps/a/ah$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$k;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$19;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$19;->a:Lcom/google/android/gms/maps/c$k;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/ah$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/g;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$19;->a:Lcom/google/android/gms/maps/c$k;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$k;->c(Lcom/google/android/gms/maps/model/g;)V

    return-void
.end method
