.class Lcom/google/android/gms/internal/dn$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dn;->a(Ljava/lang/String;[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:Lcom/google/android/gms/internal/dn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dn;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dn$4;->c:Lcom/google/android/gms/internal/dn;

    iput-object p2, p0, Lcom/google/android/gms/internal/dn$4;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/dn$4;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/dn$4;->c:Lcom/google/android/gms/internal/dn;

    iget-object v1, p0, Lcom/google/android/gms/internal/dn$4;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/dn$4;->b:[B

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dn;->b(Ljava/lang/String;[B)V

    return-void
.end method
