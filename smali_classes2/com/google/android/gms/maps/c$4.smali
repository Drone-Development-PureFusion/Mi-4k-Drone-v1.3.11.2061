.class Lcom/google/android/gms/maps/c$4;
.super Lcom/google/android/gms/maps/a/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/d;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$4;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$4;->a:Lcom/google/android/gms/maps/d;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$4;->a:Lcom/google/android/gms/maps/d;

    invoke-interface {v0}, Lcom/google/android/gms/maps/d;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/a/ak;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$4;->a:Lcom/google/android/gms/maps/d;

    new-instance v1, Lcom/google/android/gms/maps/c$4$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/c$4$1;-><init>(Lcom/google/android/gms/maps/c$4;Lcom/google/android/gms/maps/a/ak;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/d;->a(Lcom/google/android/gms/maps/d$a;)V

    return-void
.end method
