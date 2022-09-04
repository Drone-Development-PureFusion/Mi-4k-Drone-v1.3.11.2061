.class Lcom/google/android/gms/maps/c$16;
.super Lcom/google/android/gms/maps/a/al$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$n;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$16;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$16;->a:Lcom/google/android/gms/maps/c$n;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/al$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$16;->a:Lcom/google/android/gms/maps/c$n;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/c$n;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
