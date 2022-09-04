.class Lcom/google/android/gms/maps/c$17;
.super Lcom/google/android/gms/maps/a/an$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$p;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$17;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$17;->a:Lcom/google/android/gms/maps/c$p;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/an$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$17;->a:Lcom/google/android/gms/maps/c$p;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/c$p;->b(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
