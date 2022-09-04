.class Lcom/google/android/gms/maps/c$6;
.super Lcom/google/android/gms/maps/a/au$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$v;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$v;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$6;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$6;->a:Lcom/google/android/gms/maps/c$v;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/au$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/h;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$6;->a:Lcom/google/android/gms/maps/c$v;

    new-instance v1, Lcom/google/android/gms/maps/model/h;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/h;-><init>(Lcom/google/android/gms/maps/model/a/h;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$v;->a(Lcom/google/android/gms/maps/model/h;)V

    return-void
.end method
