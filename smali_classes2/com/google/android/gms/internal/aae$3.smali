.class final Lcom/google/android/gms/internal/aae$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aae;->a(Landroid/content/Context;Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/ty;Lcom/google/android/gms/internal/aad;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aad;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/google/android/gms/internal/aag;

.field final synthetic d:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aad;Landroid/content/Context;Lcom/google/android/gms/internal/aag;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aae$3;->a:Lcom/google/android/gms/internal/aad;

    iput-object p2, p0, Lcom/google/android/gms/internal/aae$3;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/aae$3;->c:Lcom/google/android/gms/internal/aag;

    iput-object p4, p0, Lcom/google/android/gms/internal/aae$3;->d:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/aae$3;->a:Lcom/google/android/gms/internal/aad;

    iget-object v0, v0, Lcom/google/android/gms/internal/aad;->e:Lcom/google/android/gms/internal/aam;

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$3;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/aae$3;->c:Lcom/google/android/gms/internal/aag;

    iget-object v3, p0, Lcom/google/android/gms/internal/aae$3;->d:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->k:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/aam;->a(Landroid/content/Context;Lcom/google/android/gms/internal/aag;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    return-void
.end method
